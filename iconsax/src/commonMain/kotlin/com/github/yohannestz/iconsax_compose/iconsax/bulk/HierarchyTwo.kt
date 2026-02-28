package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HierarchyTwo: ImageVector
    get() {
        val current = _hierarchyTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.HierarchyTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.75f, y = 22.0f)
                arcToRelative(a = 3.25f, b = 3.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -6.5f)
                arcToRelative(a = 3.25f, b = 3.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.5f)
                moveTo(x = 19.0f, y = 8.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -6.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.0f)
                moveTo(x = 5.0f, y = 8.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -6.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 4.83f, y = 8.02f)
                arcToRelative(a = 6.9f, b = 6.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 6.54f, dy1 = 4.65f)
                horizontalLineToRelative(dx = 0.03f)
                lineToRelative(dx = 3.53f, dy = -0.01f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.29f, dy1 = 2.49f)
                verticalLineTo(y = 17.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 1.52f, dy1 = 0.0f)
                verticalLineTo(y = 5.78f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -1.52f, dy1 = 0.0f)
                verticalLineToRelative(dy = 6.62f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.28f, dy1 = -1.26f)
                horizontalLineToRelative(dx = -0.02f)
                lineToRelative(dx = -3.53f, dy = 0.01f)
                horizontalLineToRelative(dx = -0.02f)
                arcToRelative(a = 5.4f, b = 5.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.09f, dy1 = -3.62f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.72f, dy1 = -0.51f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.25f, dy1 = 0.04f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.48f, dy1 = 0.96f)
            }
        }.build().also { _hierarchyTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _hierarchyTwo: ImageVector? = null
