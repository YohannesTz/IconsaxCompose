package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FolderTwo: ImageVector
    get() {
        val current = _folderTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FolderTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.43f, y = 4.03f)
                curveToRelative(dx1 = 0.14f, dy1 = 0.21f, dx2 = -0.09f, dy2 = 0.45f, dx3 = -0.33f, dy3 = 0.4f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.52f, dy1 = -0.21f)
                horizontalLineToRelative(dx = -3.3f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.4f, dy1 = -0.2f)
                lineToRelative(dx = -1.15f, dy = -1.53f)
                curveToRelative(dx1 = -0.14f, dy1 = -0.2f, dx2 = 0.0f, dy2 = -0.49f, dx3 = 0.24f, dy3 = -0.49f)
                horizontalLineToRelative(dx = 2.75f)
                arcToRelative(a = 4.4f, b = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.71f, dy1 = 2.03f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.14f, y = 6.54f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.45f, dy1 = -0.67f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.11f, dy1 = -0.15f)
                horizontalLineToRelative(dx = -3.72f)
                curveToRelative(dx1 = -0.58f, dy1 = 0.0f, dx2 = -0.62f, dy2 = -0.05f, dx3 = -0.93f, dy3 = -0.46f)
                lineToRelative(dx = -1.4f, dy = -1.86f)
                curveTo(x1 = 10.88f, y1 = 2.53f, x2 = 10.37f, y2 = 2.0f, x3 = 8.74f, y3 = 2.0f)
                horizontalLineTo(x = 6.42f)
                arcTo(horizontalEllipseRadius = 4.4f, verticalEllipseRadius = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 6.42f)
                verticalLineToRelative(dy = 11.16f)
                arcTo(horizontalEllipseRadius = 4.4f, verticalEllipseRadius = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 6.42f, y1 = 22.0f)
                horizontalLineToRelative(dx = 11.16f)
                arcTo(horizontalEllipseRadius = 4.4f, verticalEllipseRadius = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 22.0f, y1 = 17.58f)
                verticalLineToRelative(dy = -7.44f)
                arcToRelative(a = 4.4f, b = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.86f, dy1 = -3.6f)
                moveToRelative(dx = -5.75f, dy = 9.8f)
                horizontalLineTo(x = 9.6f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.69f, dy1 = -0.7f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.69f, dy1 = -0.7f)
                horizontalLineToRelative(dx = 4.79f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.7f, dy1 = 0.7f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.7f, dy1 = 0.7f)
            }
        }.build().also { _folderTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _folderTwo: ImageVector? = null
