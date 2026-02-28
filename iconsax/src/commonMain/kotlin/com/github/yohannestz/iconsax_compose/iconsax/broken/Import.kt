package com.github.yohannestz.iconsax_compose.iconsax.broken

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
                moveTo(x = 9.44f, y = 11.68f)
                lineTo(x = 12.0f, y = 14.24f)
                lineToRelative(dx = 2.56f, dy = -2.56f)
                moveTo(x = 12.0f, y = 9.0f)
                verticalLineToRelative(dy = 5.17f)
                moveTo(x = 12.0f, y = 4.0f)
                verticalLineToRelative(dy = 1.96f)
                moveToRelative(dx = 5.52f, dy = 12.05f)
                arcTo(horizontalEllipseRadius = 8.0f, verticalEllipseRadius = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 20.0f)
                curveToRelative(dx1 = -5.0f, dy1 = 0.0f, dx2 = -8.0f, dy2 = -3.58f, dx3 = -8.0f, dy3 = -8.0f)
                moveToRelative(dx = 16.0f, dy = 0.0f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.49f, dy1 = 2.97f)
            }
        }.build().also { _import = it }
    }

@Suppress("ObjectPropertyName")
private var _import: ImageVector? = null
