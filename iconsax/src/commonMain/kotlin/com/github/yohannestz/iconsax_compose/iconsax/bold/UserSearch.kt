package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UserSearch: ImageVector
    get() {
        val current = _userSearch
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.UserSearch",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 14.0f)
                curveToRelative(dx1 = -5.01f, dy1 = 0.0f, dx2 = -9.09f, dy2 = 3.36f, dx3 = -9.09f, dy3 = 7.5f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.5f, dy1 = 0.5f)
                horizontalLineToRelative(dx = 17.18f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.5f, dy1 = -0.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.14f, dx2 = -4.08f, dy2 = -7.5f, dx3 = -9.09f, dy3 = -7.5f)
                moveToRelative(dx = 4.72f, dy = -3.65f)
                lineToRelative(dx = -0.96f, dy = -0.96f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.79f, dy1 = -2.62f)
                arcTo(horizontalEllipseRadius = 4.77f, verticalEllipseRadius = 4.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 11.78f, y1 = 2.0f)
                arcToRelative(a = 4.78f, b = 4.78f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 2.61f, dy1 = 8.75f)
                lineToRelative(dx = 0.96f, dy = 0.96f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.68f, dy1 = 0.28f)
                quadToRelative(dx1 = 0.4f, dy1 = 0.0f, dx2 = 0.68f, dy2 = -0.28f)
                arcToRelative(a = 0.96f, b = 0.96f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.01f, dy1 = -1.36f)
            }
        }.build().also { _userSearch = it }
    }

@Suppress("ObjectPropertyName")
private var _userSearch: ImageVector? = null
