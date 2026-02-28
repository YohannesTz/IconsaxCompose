package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FolderCross: ImageVector
    get() {
        val current = _folderCross
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FolderCross",
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
                moveTo(x = 21.87f, y = 9.44f)
                horizontalLineTo(x = 2.13f)
                verticalLineTo(y = 6.42f)
                arcTo(horizontalEllipseRadius = 4.4f, verticalEllipseRadius = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.55f, y1 = 2.0f)
                horizontalLineToRelative(dx = 2.33f)
                curveToRelative(dx1 = 1.63f, dy1 = 0.0f, dx2 = 2.14f, dy2 = 0.53f, dx3 = 2.79f, dy3 = 1.4f)
                lineToRelative(dx = 1.4f, dy = 1.86f)
                curveToRelative(dx1 = 0.3f, dy1 = 0.41f, dx2 = 0.35f, dy2 = 0.47f, dx3 = 0.93f, dy3 = 0.47f)
                horizontalLineToRelative(dx = 2.79f)
                arcToRelative(a = 5.3f, b = 5.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.08f, dy1 = 3.71f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.99f, y = 10.84f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.25f, dy1 = -1.4f)
                horizontalLineTo(x = 2.0f)
                verticalLineToRelative(dy = 7.21f)
                curveTo(x1 = 2.0f, y1 = 19.6f, x2 = 4.4f, y2 = 22.0f, x3 = 7.35f, y3 = 22.0f)
                horizontalLineToRelative(dx = 9.3f)
                curveTo(x1 = 19.6f, y1 = 22.0f, x2 = 22.0f, y2 = 19.6f, x3 = 22.0f, y3 = 16.65f)
                verticalLineToRelative(dy = -5.58f)
                close()
                moveToRelative(dx = -7.65f, dy = 6.94f)
                quadTo(x1 = 14.1f, y1 = 18.0f, x2 = 13.81f, y2 = 18.0f)
                curveToRelative(dx1 = -0.29f, dy1 = 0.01f, dx2 = -0.38f, dy2 = -0.07f, dx3 = -0.53f, dy3 = -0.22f)
                lineToRelative(dx = -1.24f, dy = -1.24f)
                lineToRelative(dx = -1.28f, dy = 1.28f)
                quadToRelative(dx1 = -0.24f, dy1 = 0.22f, dx2 = -0.53f, dy2 = 0.22f)
                curveToRelative(dx1 = -0.29f, dy1 = 0.0f, dx2 = -0.38f, dy2 = -0.07f, dx3 = -0.53f, dy3 = -0.22f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                lineToRelative(dx = 1.28f, dy = -1.28f)
                lineToRelative(dx = -1.24f, dy = -1.24f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                lineToRelative(dx = 1.24f, dy = 1.24f)
                lineToRelative(dx = 1.2f, dy = -1.2f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                lineToRelative(dx = -1.2f, dy = 1.2f)
                lineToRelative(dx = 1.24f, dy = 1.24f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
            }
        }.build().also { _folderCross = it }
    }

@Suppress("ObjectPropertyName")
private var _folderCross: ImageVector? = null
