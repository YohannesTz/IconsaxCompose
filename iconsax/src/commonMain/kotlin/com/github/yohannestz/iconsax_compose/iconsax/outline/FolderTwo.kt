package com.github.yohannestz.iconsax_compose.iconsax.outline

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
                moveTo(x = 17.0f, y = 22.75f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -4.41f, dy1 = 0.0f, dx2 = -5.75f, dy2 = -1.34f, dx3 = -5.75f, dy3 = -5.75f)
                verticalLineTo(y = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.41f, dx2 = 1.34f, dy2 = -5.75f, dx3 = 5.75f, dy3 = -5.75f)
                horizontalLineToRelative(dx = 1.5f)
                curveToRelative(dx1 = 1.75f, dy1 = 0.0f, dx2 = 2.3f, dy2 = 0.57f, dx3 = 3.0f, dy3 = 1.5f)
                lineToRelative(dx = 1.5f, dy = 2.0f)
                curveToRelative(dx1 = 0.33f, dy1 = 0.44f, dx2 = 0.38f, dy2 = 0.5f, dx3 = 1.0f, dy3 = 0.5f)
                horizontalLineToRelative(dx = 3.0f)
                curveToRelative(dx1 = 4.41f, dy1 = 0.0f, dx2 = 5.75f, dy2 = 1.34f, dx3 = 5.75f, dy3 = 5.75f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.41f, dx2 = -1.34f, dy2 = 5.75f, dx3 = -5.75f, dy3 = 5.75f)
                moveToRelative(dx = -10.0f, dy = -20.0f)
                curveTo(x1 = 3.42f, y1 = 2.75f, x2 = 2.75f, y2 = 3.43f, x3 = 2.75f, y3 = 7.0f)
                verticalLineToRelative(dy = 10.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.57f, dx2 = 0.67f, dy2 = 4.25f, dx3 = 4.25f, dy3 = 4.25f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 3.58f, dy1 = 0.0f, dx2 = 4.25f, dy2 = -0.68f, dx3 = 4.25f, dy3 = -4.25f)
                verticalLineToRelative(dy = -6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.57f, dx2 = -0.67f, dy2 = -4.25f, dx3 = -4.25f, dy3 = -4.25f)
                horizontalLineToRelative(dx = -3.0f)
                curveToRelative(dx1 = -1.28f, dy1 = 0.0f, dx2 = -1.7f, dy2 = -0.44f, dx3 = -2.2f, dy3 = -1.1f)
                lineToRelative(dx = -1.5f, dy = -2.0f)
                curveToRelative(dx1 = -0.52f, dy1 = -0.69f, dx2 = -0.68f, dy2 = -0.9f, dx3 = -1.8f, dy3 = -0.9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.0f, y = 7.13f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineTo(y = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.58f, dx2 = -0.67f, dy2 = -2.25f, dx3 = -2.25f, dy3 = -2.25f)
                horizontalLineTo(x = 8.0f)
                curveTo(x1 = 7.59f, y1 = 2.75f, x2 = 7.25f, y2 = 2.41f, x3 = 7.25f, y3 = 2.0f)
                reflectiveCurveTo(x1 = 7.59f, y1 = 1.25f, x2 = 8.0f, y2 = 1.25f)
                horizontalLineToRelative(dx = 9.0f)
                curveToRelative(dx1 = 2.42f, dy1 = 0.0f, dx2 = 3.75f, dy2 = 1.33f, dx3 = 3.75f, dy3 = 3.75f)
                verticalLineToRelative(dy = 1.38f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 20.0f, y1 = 7.13f)
            }
        }.build().also { _folderTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _folderTwo: ImageVector? = null
