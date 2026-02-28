package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FolderOpen: ImageVector
    get() {
        val current = _folderOpen
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FolderOpen",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.29f, y = 22.75f)
                horizontalLineTo(x = 5.7f)
                curveToRelative(dx1 = -3.4f, dy1 = 0.0f, dx2 = -3.58f, dy2 = -1.87f, dx3 = -3.73f, dy3 = -3.38f)
                lineToRelative(dx = -0.4f, dy = -5.01f)
                arcToRelative(a = 3.8f, b = 3.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.8f, dy1 = -2.72f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.93f, dy1 = -1.39f)
                horizontalLineToRelative(dx = 13.38f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.87f, dy1 = 1.34f)
                lineToRelative(dx = 0.17f, dy = 0.23f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.69f, dy1 = 2.55f)
                lineToRelative(dx = -0.4f, dy = 4.99f)
                curveToRelative(dx1 = -0.15f, dy1 = 1.52f, dx2 = -0.33f, dy2 = 3.39f, dx3 = -3.73f, dy3 = 3.39f)
                moveToRelative(dx = -12.98f, dy = -11.0f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.73f, dy1 = 0.82f)
                lineTo(x = 3.5f, y = 12.64f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.43f, dy1 = 1.59f)
                lineToRelative(dx = 0.4f, dy = 5.01f)
                curveToRelative(dx1 = 0.14f, dy1 = 1.46f, dx2 = 0.2f, dy2 = 2.01f, dx3 = 2.23f, dy3 = 2.01f)
                horizontalLineToRelative(dx = 12.58f)
                curveToRelative(dx1 = 2.04f, dy1 = 0.0f, dx2 = 2.09f, dy2 = -0.55f, dx3 = 2.23f, dy3 = -2.02f)
                lineToRelative(dx = 0.4f, dy = -5.01f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.5f, dy1 = -1.64f)
                lineToRelative(dx = -0.1f, dy = -0.12f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.64f, dy1 = -0.71f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.5f, y = 12.22f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineTo(y = 9.68f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.98f, dx2 = -0.52f, dy2 = -3.5f, dx3 = -3.5f, dy3 = -3.5f)
                horizontalLineTo(x = 13.7f)
                curveToRelative(dx1 = -1.13f, dy1 = 0.0f, dx2 = -1.52f, dy2 = -0.4f, dx3 = -1.95f, dy3 = -0.97f)
                lineToRelative(dx = -1.29f, dy = -1.7f)
                curveToRelative(dx1 = -0.44f, dy1 = -0.59f, dx2 = -0.54f, dy2 = -0.73f, dx3 = -1.44f, dy3 = -0.73f)
                horizontalLineTo(x = 7.75f)
                curveToRelative(dx1 = -2.98f, dy1 = 0.0f, dx2 = -3.5f, dy2 = 0.52f, dx3 = -3.5f, dy3 = 3.5f)
                verticalLineToRelative(dy = 5.15f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                verticalLineTo(y = 6.28f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.83f, dx2 = 1.17f, dy2 = -5.0f, dx3 = 5.0f, dy3 = -5.0f)
                horizontalLineToRelative(dx = 1.28f)
                curveToRelative(dx1 = 1.54f, dy1 = 0.0f, dx2 = 2.02f, dy2 = 0.5f, dx3 = 2.64f, dy3 = 1.32f)
                lineToRelative(dx = 1.28f, dy = 1.7f)
                curveToRelative(dx1 = 0.27f, dy1 = 0.36f, dx2 = 0.29f, dy2 = 0.38f, dx3 = 0.76f, dy3 = 0.38f)
                horizontalLineToRelative(dx = 2.55f)
                curveToRelative(dx1 = 3.83f, dy1 = 0.0f, dx2 = 5.0f, dy2 = 1.17f, dx3 = 5.0f, dy3 = 5.0f)
                verticalLineToRelative(dy = 1.8f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.76f, dy1 = 0.74f)
                moveToRelative(dx = -5.93f, dy = 5.53f)
                horizontalLineTo(x = 9.43f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 5.14f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
            }
        }.build().also { _folderOpen = it }
    }

@Suppress("ObjectPropertyName")
private var _folderOpen: ImageVector? = null
