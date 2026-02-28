package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HomeTwo: ImageVector
    get() {
        val current = _homeTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.HomeTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.79f, y = 22.75f)
                horizontalLineTo(x = 6.21f)
                arcToRelative(a = 4.97f, b = 4.97f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.96f, dy1 = -4.97f)
                verticalLineToRelative(dy = -7.41f)
                arcToRelative(a = 5.5f, b = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.92f, dy1 = -3.91f)
                lineToRelative(dx = 5.39f, dy = -4.2f)
                arcToRelative(a = 5.2f, b = 5.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.89f, dy1 = -0.14f)
                lineToRelative(dx = 6.18f, dy = 4.33f)
                arcToRelative(a = 5.5f, b = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.12f, dy1 = 4.06f)
                verticalLineToRelative(dy = 7.28f)
                arcToRelative(a = 4.97f, b = 4.97f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.96f, dy1 = 4.96f)
                moveTo(x = 9.48f, y = 3.44f)
                lineToRelative(dx = -5.39f, dy = 4.2f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.34f, dy1 = 2.73f)
                verticalLineToRelative(dy = 7.41f)
                arcToRelative(a = 3.47f, b = 3.47f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.46f, dy1 = 3.47f)
                horizontalLineToRelative(dx = 11.58f)
                arcToRelative(a = 3.46f, b = 3.46f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.46f, dy1 = -3.46f)
                verticalLineToRelative(dy = -7.28f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.48f, dy1 = -2.83f)
                lineToRelative(dx = -6.18f, dy = -4.33f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.11f, dy1 = 0.09f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 18.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.25f, y1 = 18.0f)
                verticalLineToRelative(dy = -3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 3.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 18.75f)
            }
        }.build().also { _homeTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _homeTwo: ImageVector? = null
