package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Weight: ImageVector
    get() {
        val current = _weight
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Weight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.18f, y = 18.0f)
                curveToRelative(dx1 = 2.4f, dy1 = 0.0f, dx2 = 3.0f, dy2 = -1.35f, dx3 = 3.0f, dy3 = -3.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.65f, dx2 = -0.6f, dy2 = -3.0f, dx3 = -3.0f, dy3 = -3.0f)
                reflectiveCurveToRelative(dx1 = -3.0f, dy1 = 1.35f, dx2 = -3.0f, dy2 = 3.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.65f, dx2 = 0.6f, dy2 = 3.0f, dx3 = 3.0f, dy3 = 3.0f)
                moveTo(x = 6.82f, y = 18.0f)
                curveToRelative(dx1 = -2.4f, dy1 = 0.0f, dx2 = -3.0f, dy2 = -1.35f, dx3 = -3.0f, dy3 = -3.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.65f, dx2 = 0.6f, dy2 = -3.0f, dx3 = 3.0f, dy3 = -3.0f)
                reflectiveCurveToRelative(dx1 = 3.0f, dy1 = 1.35f, dx2 = 3.0f, dy2 = 3.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.65f, dx2 = -0.6f, dy2 = 3.0f, dx3 = -3.0f, dy3 = 3.0f)
                moveToRelative(dx = 3.0f, dy = -6.0f)
                horizontalLineToRelative(dx = 4.36f)
                moveToRelative(dx = 8.32f, dy = 2.5f)
                verticalLineToRelative(dy = -5.0f)
                moveToRelative(dx = -21.0f, dy = 5.0f)
                verticalLineToRelative(dy = -5.0f)
            }
        }.build().also { _weight = it }
    }

@Suppress("ObjectPropertyName")
private var _weight: ImageVector? = null
