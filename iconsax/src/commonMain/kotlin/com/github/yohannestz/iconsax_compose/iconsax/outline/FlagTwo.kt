package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FlagTwo: ImageVector
    get() {
        val current = _flagTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FlagTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 6.45f, y = 22.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.7f, y1 = 22.0f)
                verticalLineTo(y = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 7.2f, y1 = 1.59f, x2 = 7.2f, y2 = 2.0f)
                verticalLineToRelative(dy = 20.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 6.95f, y = 17.75f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.67f, dy1 = -0.42f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.34f, dy1 = -1.0f)
                lineToRelative(dx = 8.3f, dy = -4.1f)
                curveToRelative(dx1 = 1.22f, dy1 = -0.63f, dx2 = 1.91f, dy2 = -1.39f, dx3 = 1.88f, dy3 = -2.1f)
                curveToRelative(dx1 = -0.03f, dy1 = -0.69f, dx2 = -0.77f, dy2 = -1.4f, dx3 = -2.04f, dy3 = -1.94f)
                lineToRelative(dx = -8.1f, dy = -3.5f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.4f, dy1 = -0.99f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.99f, dy1 = -0.39f)
                lineToRelative(dx = 8.1f, dy = 3.5f)
                curveToRelative(dx1 = 2.5f, dy1 = 1.06f, dx2 = 2.92f, dy2 = 2.5f, dx3 = 2.95f, dy3 = 3.26f)
                curveToRelative(dx1 = 0.05f, dy1 = 1.33f, dx2 = -0.91f, dy2 = 2.57f, dx3 = -2.7f, dy3 = 3.49f)
                lineToRelative(dx = -8.31f, dy = 4.11f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.34f, dy1 = 0.08f)
            }
        }.build().also { _flagTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _flagTwo: ImageVector? = null
