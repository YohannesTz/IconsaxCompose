package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FolderMinus: ImageVector
    get() {
        val current = _folderMinus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FolderMinus",
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
                moveTo(x = 21.74f, y = 9.44f)
                horizontalLineTo(x = 2.0f)
                verticalLineTo(y = 6.42f)
                arcTo(horizontalEllipseRadius = 4.4f, verticalEllipseRadius = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.42f, y1 = 2.0f)
                horizontalLineToRelative(dx = 2.33f)
                curveToRelative(dx1 = 1.63f, dy1 = 0.0f, dx2 = 2.14f, dy2 = 0.53f, dx3 = 2.79f, dy3 = 1.4f)
                lineToRelative(dx = 1.4f, dy = 1.86f)
                curveToRelative(dx1 = 0.31f, dy1 = 0.41f, dx2 = 0.35f, dy2 = 0.47f, dx3 = 0.93f, dy3 = 0.47f)
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
                moveToRelative(dx = -7.56f, dy = 5.46f)
                horizontalLineToRelative(dx = -5.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 5.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _folderMinus = it }
    }

@Suppress("ObjectPropertyName")
private var _folderMinus: ImageVector? = null
