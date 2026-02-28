package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Import: ImageVector
    get() {
        val current = _import
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Import",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.32f, y = 11.68f)
                lineToRelative(dx = 2.56f, dy = 2.56f)
                lineToRelative(dx = 2.56f, dy = -2.56f)
                moveTo(x = 11.88f, y = 4.0f)
                verticalLineToRelative(dy = 10.17f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 20.0f, y = 12.18f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.42f, dx2 = -3.0f, dy2 = 8.0f, dx3 = -8.0f, dy3 = 8.0f)
                reflectiveCurveToRelative(dx1 = -8.0f, dy1 = -3.58f, dx2 = -8.0f, dy2 = -8.0f)
            }
        }.build().also { _import = it }
    }

@Suppress("ObjectPropertyName")
private var _import: ImageVector? = null
