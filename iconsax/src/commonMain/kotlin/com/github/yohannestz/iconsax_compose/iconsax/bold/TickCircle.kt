package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TickCircle: ImageVector
    get() {
        val current = _tickCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TickCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                curveTo(x1 = 6.49f, y1 = 2.0f, x2 = 2.0f, y2 = 6.49f, x3 = 2.0f, y3 = 12.0f)
                reflectiveCurveToRelative(dx1 = 4.49f, dy1 = 10.0f, dx2 = 10.0f, dy2 = 10.0f)
                reflectiveCurveToRelative(dx1 = 10.0f, dy1 = -4.49f, dx2 = 10.0f, dy2 = -10.0f)
                reflectiveCurveTo(x1 = 17.51f, y1 = 2.0f, x2 = 12.0f, y2 = 2.0f)
                moveToRelative(dx = 4.78f, dy = 7.7f)
                lineToRelative(dx = -5.67f, dy = 5.67f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.06f, dy1 = 0.0f)
                lineToRelative(dx = -2.83f, dy = -2.83f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                lineToRelative(dx = 2.3f, dy = 2.3f)
                lineToRelative(dx = 5.14f, dy = -5.14f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
            }
        }.build().also { _tickCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _tickCircle: ImageVector? = null
