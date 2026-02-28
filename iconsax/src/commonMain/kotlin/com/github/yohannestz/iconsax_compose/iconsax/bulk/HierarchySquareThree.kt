package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HierarchySquareThree: ImageVector
    get() {
        val current = _hierarchySquareThree
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.HierarchySquareThree",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 16.19f, y = 22.0f)
                horizontalLineTo(x = 7.82f)
                curveToRelative(dx1 = -3.64f, dy1 = 0.0f, dx2 = -5.81f, dy2 = -2.17f, dx3 = -5.81f, dy3 = -5.8f)
                verticalLineTo(y = 7.81f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.64f, dx2 = 2.17f, dy2 = -5.8f, dx3 = 5.81f, dy3 = -5.8f)
                horizontalLineToRelative(dx = 8.37f)
                curveToRelative(dx1 = 3.64f, dy1 = 0.0f, dx2 = 5.81f, dy2 = 2.16f, dx3 = 5.81f, dy3 = 5.8f)
                verticalLineToRelative(dy = 8.37f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.64f, dx2 = -2.17f, dy2 = 5.81f, dx3 = -5.81f, dy3 = 5.81f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.41f, y = 9.83f)
                arcToRelative(a = 4.3f, b = 4.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.09f, dy1 = 2.91f)
                horizontalLineTo(x = 12.3f)
                lineToRelative(dx = -2.06f, dy = -0.01f)
                horizontalLineToRelative(dx = -0.01f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.62f, dy1 = 1.24f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -1.56f, dy1 = 0.09f)
                verticalLineTo(y = 9.72f)
                arcToRelative(a = 2.05f, b = 2.05f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.3f, dy1 = -1.9f)
                arcToRelative(a = 2.05f, b = 2.05f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.1f, dy1 = 0.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.87f, dx2 = -0.54f, dy2 = 1.6f, dx3 = -1.3f, dy3 = 1.9f)
                verticalLineToRelative(dy = 2.02f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.68f, dy1 = -0.49f)
                horizontalLineToRelative(dx = 0.01f)
                lineToRelative(dx = 2.06f, dy = 0.01f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.65f, dy1 = -1.82f)
                arcToRelative(a = 2.05f, b = 2.05f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 3.29f, dy1 = -1.62f)
                arcToRelative(a = 2.03f, b = 2.03f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.83f, dy1 = 2.01f)
            }
        }.build().also { _hierarchySquareThree = it }
    }

@Suppress("ObjectPropertyName")
private var _hierarchySquareThree: ImageVector? = null
